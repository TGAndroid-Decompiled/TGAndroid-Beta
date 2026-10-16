package yh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class s2 implements Comparator {
    public final int f49114a;
    public final g4 f49115b;

    public s2(g4 g4Var, int i10) {
        this.f49114a = i10;
        this.f49115b = g4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f49114a) {
            case 0:
                t3 t3Var = this.f49115b.d;
                Integer num = (Integer) t3Var.f49139o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f18922id));
                Integer num2 = (Integer) t3Var.f49139o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f18922id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                t3 t3Var2 = this.f49115b.d;
                Integer num3 = (Integer) t3Var2.f49138n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) t3Var2.f49138n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                t3 t3Var3 = this.f49115b.d;
                Integer num5 = (Integer) t3Var3.f49137m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f18922id));
                Integer num6 = (Integer) t3Var3.f49137m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f18922id));
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
