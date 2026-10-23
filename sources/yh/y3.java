package yh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class y3 implements Comparator {
    public final int f51075a;
    public final e4 f51076b;

    public y3(e4 e4Var, int i10) {
        this.f51075a = i10;
        this.f51076b = e4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f51075a) {
            case 0:
                e4 e4Var = this.f51076b;
                Integer num = (Integer) e4Var.f50681c.f50976n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) e4Var.f50681c.f50976n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                e4 e4Var2 = this.f51076b;
                Integer num3 = (Integer) e4Var2.f50681c.f50977o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f20349id));
                Integer num4 = (Integer) e4Var2.f50681c.f50977o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f20349id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                e4 e4Var3 = this.f51076b;
                Integer num5 = (Integer) e4Var3.f50681c.f50975m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f20349id));
                Integer num6 = (Integer) e4Var3.f50681c.f50975m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f20349id));
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
