package yh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class s2 implements Comparator {
    public final int f50570a;
    public final g4 f50571b;

    public s2(g4 g4Var, int i10) {
        this.f50570a = i10;
        this.f50571b = g4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f50570a) {
            case 0:
                t3 t3Var = this.f50571b.d;
                Integer num = (Integer) t3Var.f50597o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f19902id));
                Integer num2 = (Integer) t3Var.f50597o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f19902id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                t3 t3Var2 = this.f50571b.d;
                Integer num3 = (Integer) t3Var2.f50596n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) t3Var2.f50596n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                t3 t3Var3 = this.f50571b.d;
                Integer num5 = (Integer) t3Var3.f50595m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f19902id));
                Integer num6 = (Integer) t3Var3.f50595m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f19902id));
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
