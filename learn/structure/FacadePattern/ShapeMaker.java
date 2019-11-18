package learn.structure.FacadePattern;

/**
 * 外观类
 */
public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
   }

   public void drawCircle(){
      circle.draw();
   }
   public void drawRectangle(){
      rectangle.draw();
   }
}