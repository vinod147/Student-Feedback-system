/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.68
 * Generated at: 2021-11-01 14:31:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("(function(e){var t,o={className:\"autosizejs\",append:\"\",callback:!1,resizeDelay:10},i='<textarea tabindex=\"-1\" style=\"position:absolute; top:-999px; left:0; right:auto; bottom:auto; border:0; padding: 0; -moz-box-sizing:content-box; -webkit-box-sizing:content-box; box-sizing:content-box; word-wrap:break-word; height:0 !important; min-height:0 !important; overflow:hidden; transition:none; -webkit-transition:none; -moz-transition:none;\"/>',n=[\"fontFamily\",\"fontSize\",\"fontWeight\",\"fontStyle\",\"letterSpacing\",\"textTransform\",\"wordSpacing\",\"textIndent\"],s=e(i).data(\"autosize\",!0)[0];s.style.lineHeight=\"99px\",\"99px\"===e(s).css(\"lineHeight\")&&n.push(\"lineHeight\"),s.style.lineHeight=\"\",e.fn.autosize=function(i){return this.length?(i=e.extend({},o,i||{}),s.parentNode!==document.body&&e(document.body).append(s),this.each(function(){function o(){var t,o;\"getComputedStyle\"in window?(t=window.getComputedStyle(u,null),o=u.getBoundingClientRect().width,e.each([\"paddingLeft\",\"paddingRight\",\"borderLeftWidth\",\"borderRightWidth\"],function(e,i){o-=parseInt(t[i],10)}),s.style.width=o+\"px\"):s.style.width=Math.max(p.width(),0)+\"px\"}function a(){var a={};if(t=u,s.className=i.className,d=parseInt(p.css(\"maxHeight\"),10),e.each(n,function(e,t){a[t]=p.css(t)}),e(s).css(a),o(),window.chrome){var r=u.style.width;u.style.width=\"0px\",u.offsetWidth,u.style.width=r}}function r(){var e,n;t!==u?a():o(),s.value=u.value+i.append,s.style.overflowY=u.style.overflowY,n=parseInt(u.style.height,10),s.scrollTop=0,s.scrollTop=9e4,e=s.scrollTop,d&&e>d?(u.style.overflowY=\"scroll\",e=d):(u.style.overflowY=\"hidden\",c>e&&(e=c)),e+=w,n!==e&&(u.style.height=e+\"px\",f&&i.callback.call(u,u))}function l(){clearTimeout(h),h=setTimeout(function(){var e=p.width();e!==g&&(g=e,r())},parseInt(i.resizeDelay,10))}var d,c,h,u=this,p=e(u),w=0,f=e.isFunction(i.callback),z={height:u.style.height,overflow:u.style.overflow,overflowY:u.style.overflowY,wordWrap:u.style.wordWrap,resize:u.style.resize},g=p.width();p.data(\"autosize\")||(p.data(\"autosize\",!0),(\"border-box\"===p.css(\"box-sizing\")||\"border-box\"===p.css(\"-moz-box-sizing\")||\"border-box\"===p.css(\"-webkit-box-sizing\"))&&(w=p.outerHeight()-p.height()),c=Math.max(parseInt(p.css(\"minHeight\"),10)-w||0,p.height()),p.css({overflow:\"hidden\",overflowY:\"hidden\",wordWrap:\"break-word\",resize:\"none\"===p.css(\"resize\")||\"vertical\"===p.css(\"resize\")?\"none\":\"horizontal\"}),\"onpropertychange\"in u?\"oninput\"in u?p.on(\"input.autosize keyup.autosize\",r):p.on(\"propertychange.autosize\",function(){\"value\"===event.propertyName&&r()}):p.on(\"input.autosize\",r),i.resizeDelay!==!1&&e(window).on(\"resize.autosize\",l),p.on(\"autosize.resize\",r),p.on(\"autosize.resizeIncludeStyle\",function(){t=null,r()}),p.on(\"autosize.destroy\",function(){t=null,clearTimeout(h),e(window).off(\"resize\",l),p.off(\"autosize\").off(\".autosize\").css(z).removeData(\"autosize\")}),r())})):this}})(window.jQuery||window.$);\r\n");
      out.write("\r\n");
      out.write("var __slice=[].slice;(function(e,t){var n;n=function(){function t(t,n){var r,i,s,o=this;this.options=e.extend({},this.defaults,n);this.$el=t;s=this.defaults;for(r in s){i=s[r];if(this.$el.data(r)!=null){this.options[r]=this.$el.data(r)}}this.createStars();this.syncRating();this.$el.on(\"mouseover.starrr\",\"span\",function(e){return o.syncRating(o.$el.find(\"span\").index(e.currentTarget)+1)});this.$el.on(\"mouseout.starrr\",function(){return o.syncRating()});this.$el.on(\"click.starrr\",\"span\",function(e){return o.setRating(o.$el.find(\"span\").index(e.currentTarget)+1)});this.$el.on(\"starrr:change\",this.options.change)}t.prototype.defaults={rating:void 0,numStars:5,change:function(e,t){}};t.prototype.createStars=function(){var e,t,n;n=[];for(e=1,t=this.options.numStars;1<=t?e<=t:e>=t;1<=t?e++:e--){n.push(this.$el.append(\"<span class='glyphicon .glyphicon-star-empty'></span>\"))}return n};t.prototype.setRating=function(e){if(this.options.rating===e){e=void 0}this.options.rating=e;this.syncRating();return this.$el.trigger(\"starrr:change\",e)};t.prototype.syncRating=function(e){var t,n,r,i;e||(e=this.options.rating);if(e){for(t=n=0,i=e-1;0<=i?n<=i:n>=i;t=0<=i?++n:--n){this.$el.find(\"span\").eq(t).removeClass(\"glyphicon-star-empty\").addClass(\"glyphicon-star\")}}if(e&&e<5){for(t=r=e;e<=4?r<=4:r>=4;t=e<=4?++r:--r){this.$el.find(\"span\").eq(t).removeClass(\"glyphicon-star\").addClass(\"glyphicon-star-empty\")}}if(!e){return this.$el.find(\"span\").removeClass(\"glyphicon-star\").addClass(\"glyphicon-star-empty\")}};return t}();return e.fn.extend({starrr:function(){var t,r;r=arguments[0],t=2<=arguments.length?__slice.call(arguments,1):[];return this.each(function(){var i;i=e(this).data(\"star-rating\");if(!i){e(this).data(\"star-rating\",i=new n(e(this),r))}if(typeof r===\"string\"){return i[r].apply(i,t)}})}})})(window.jQuery,window);$(function(){return $(\".starrr\").starrr()})\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\r\n");
      out.write("  $('#new-review').autosize({append: \"\\n\"});\r\n");
      out.write("\r\n");
      out.write("  var reviewBox = $('#post-review-box');\r\n");
      out.write("  var newReview = $('#new-review');\r\n");
      out.write("  var openReviewBtn = $('#open-review-box');\r\n");
      out.write("  var closeReviewBtn = $('#close-review-box');\r\n");
      out.write("  var ratingsField = $('#ratings-hidden');\r\n");
      out.write("\r\n");
      out.write("  openReviewBtn.click(function(e)\r\n");
      out.write("  {\r\n");
      out.write("    reviewBox.slideDown(400, function()\r\n");
      out.write("      {\r\n");
      out.write("        $('#new-review').trigger('autosize.resize');\r\n");
      out.write("        newReview.focus();\r\n");
      out.write("      });\r\n");
      out.write("    openReviewBtn.fadeOut(100);\r\n");
      out.write("    closeReviewBtn.show();\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("  closeReviewBtn.click(function(e)\r\n");
      out.write("  {\r\n");
      out.write("    e.preventDefault();\r\n");
      out.write("    reviewBox.slideUp(300, function()\r\n");
      out.write("      {\r\n");
      out.write("        newReview.focus();\r\n");
      out.write("        openReviewBtn.fadeIn(200);\r\n");
      out.write("      });\r\n");
      out.write("    closeReviewBtn.hide();\r\n");
      out.write("    \r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("  $('.starrr').on('starrr:change', function(e, value){\r\n");
      out.write("    ratingsField.val(value);\r\n");
      out.write("  });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("background-image: url(\"bg/sea-3652697_1920.jpg\")\r\n");
      out.write("}\r\n");
      out.write("h1{\r\n");
      out.write("color:#87AAAA;\r\n");
      out.write("margin-bottom:40px;\r\n");
      out.write(" text-align: center;\r\n");
      out.write("}\r\n");
      out.write(" .animated {\r\n");
      out.write("    -webkit-transition: height 0.2s;\r\n");
      out.write("    -moz-transition: height 0.2s;\r\n");
      out.write("    transition: height 0.2s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".stars\r\n");
      out.write("{\r\n");
      out.write("    margin: 20px 0;\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    color: #d17581;\r\n");
      out.write("}\r\n");
      out.write("@import url('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css');\r\n");
      out.write("body{\r\n");
      out.write("    padding:5%;\r\n");
      out.write("}\r\n");
      out.write("select{\r\n");
      out.write("    font-family: 'FontAwesome' , 'TATSanaChon';\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");

try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/feedback","root","root");
	Statement st = con.createStatement();
	
	ResultSet res = st.executeQuery("select FacultyId from faculty");
	
		
	

      out.write("\r\n");
      out.write(" <form accept-charset=\"UTF-8\" action=\"feedback\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("    <p><h1>Select Faculty</h1></p>\r\n");
      out.write("\t<select name=\"fid\" class=\"form-control\">\r\n");
      out.write("\t");

	while(res.next()){
	
      out.write("\r\n");
      out.write("      <option>");
      out.print(res.getString(1));
      out.write("</option>\r\n");
      out.write("      \r\n");
      out.write("     ");
}
	
	}
	catch(Exception e){
		System.out.println(e);
	}



      out.write("\r\n");
      out.write("    </select>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"row\" style=\"margin-top:40px;\">\r\n");
      out.write("\t\t<div class=\"col-md-6\">\r\n");
      out.write("    \t<div class=\"well well-sm\">\r\n");
      out.write("            <div class=\"text-right\">\r\n");
      out.write("                <a class=\"btn btn-success btn-green\" href=\"#reviews-anchor\" id=\"open-review-box\">Leave a Review</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"row\" id=\"post-review-box\" style=\"display:none;\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                   \r\n");
      out.write("                        <input id=\"ratings-hidden\" name=\"rating\" type=\"hidden\"> \r\n");
      out.write("                        <textarea class=\"form-control animated\" cols=\"50\" id=\"new-review\" name=\"comment\" placeholder=\"Enter your review here...\" rows=\"5\"></textarea>\r\n");
      out.write("        \r\n");
      out.write("                        <div class=\"text-right\">\r\n");
      out.write("                            <div class=\"stars starrr\" data-rating=\"0\"></div>\r\n");
      out.write("                            <a class=\"btn btn-danger btn-sm\" href=\"#\" id=\"close-review-box\" style=\"display:none; margin-right: 10px;\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-remove\"></span>Cancel</a>\r\n");
      out.write("                            <input type=\"Submit\" value=\"Save\" class=\"btn btn-success \"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div> \r\n");
      out.write("         \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
