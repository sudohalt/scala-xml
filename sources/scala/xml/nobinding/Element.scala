package scala.xml.nobinding;

import scala.collection.Map ;
import scala.xml.Node ;

/** an XML node. use this when data binding is not desired.
**/
case class Element( symbol: Symbol, ch: List[Node] ) extends Node {

  def label = symbol.name;
  def children = ch;

  protected val attribHashCode = 0;            /* overriden at parse time */
  def attributes : Map[String,String] = null ; /* overriden at parse time */

}
