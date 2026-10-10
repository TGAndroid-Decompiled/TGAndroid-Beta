package xh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class a4 implements Comparator {
    public final int f51214a;
    public final g4 f51215b;

    public a4(g4 g4Var, int i10) {
        this.f51214a = i10;
        this.f51215b = g4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f51214a) {
            case 0:
                g4 g4Var = this.f51215b;
                Integer num = (Integer) g4Var.f51300c.f51607n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) g4Var.f51300c.f51607n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                g4 g4Var2 = this.f51215b;
                Integer num3 = (Integer) g4Var2.f51300c.f51608o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f20048id));
                Integer num4 = (Integer) g4Var2.f51300c.f51608o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f20048id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                g4 g4Var3 = this.f51215b;
                Integer num5 = (Integer) g4Var3.f51300c.f51606m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f20048id));
                Integer num6 = (Integer) g4Var3.f51300c.f51606m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f20048id));
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
