package xh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class t2 implements Comparator {
    public final int f46127a;
    public final h4 f46128b;

    public t2(h4 h4Var, int i10) {
        this.f46127a = i10;
        this.f46128b = h4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f46127a) {
            case 0:
                u3 u3Var = this.f46128b.d;
                Integer num = (Integer) u3Var.f46154o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f18118id));
                Integer num2 = (Integer) u3Var.f46154o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f18118id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                u3 u3Var2 = this.f46128b.d;
                Integer num3 = (Integer) u3Var2.f46153n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) u3Var2.f46153n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                u3 u3Var3 = this.f46128b.d;
                Integer num5 = (Integer) u3Var3.f46152m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f18118id));
                Integer num6 = (Integer) u3Var3.f46152m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f18118id));
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
