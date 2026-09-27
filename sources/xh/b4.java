package xh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class b4 implements Comparator {
    public final int f46150a;
    public final h4 f46151b;

    public b4(h4 h4Var, int i10) {
        this.f46150a = i10;
        this.f46151b = h4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f46150a) {
            case 0:
                h4 h4Var = this.f46151b;
                Integer num = (Integer) h4Var.f46234c.f46535n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) h4Var.f46234c.f46535n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                h4 h4Var2 = this.f46151b;
                Integer num3 = (Integer) h4Var2.f46234c.f46536o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f18335id));
                Integer num4 = (Integer) h4Var2.f46234c.f46536o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f18335id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                h4 h4Var3 = this.f46151b;
                Integer num5 = (Integer) h4Var3.f46234c.f46534m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f18335id));
                Integer num6 = (Integer) h4Var3.f46234c.f46534m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f18335id));
                if (num5 == null) {
                    return 1;
                }
                if (num6 == null) {
                    return -1;
                }
                return num6.intValue() - num5.intValue();
        }
    }
}
