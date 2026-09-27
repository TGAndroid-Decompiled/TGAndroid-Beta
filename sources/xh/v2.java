package xh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class v2 implements Comparator {
    public final int f46509a;
    public final j4 f46510b;

    public v2(j4 j4Var, int i10) {
        this.f46509a = i10;
        this.f46510b = j4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f46509a) {
            case 0:
                w3 w3Var = this.f46510b.d;
                Integer num = (Integer) w3Var.f46536o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f18335id));
                Integer num2 = (Integer) w3Var.f46536o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f18335id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                w3 w3Var2 = this.f46510b.d;
                Integer num3 = (Integer) w3Var2.f46535n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) w3Var2.f46535n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                w3 w3Var3 = this.f46510b.d;
                Integer num5 = (Integer) w3Var3.f46534m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f18335id));
                Integer num6 = (Integer) w3Var3.f46534m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f18335id));
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
