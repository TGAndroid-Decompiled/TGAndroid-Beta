package xh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class a4 implements Comparator {
    public final int f49892a;
    public final g4 f49893b;

    public a4(g4 g4Var, int i10) {
        this.f49892a = i10;
        this.f49893b = g4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f49892a) {
            case 0:
                g4 g4Var = this.f49893b;
                Integer num = (Integer) g4Var.f49980c.f50299n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) g4Var.f49980c.f50299n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                g4 g4Var2 = this.f49893b;
                Integer num3 = (Integer) g4Var2.f49980c.f50300o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f20053id));
                Integer num4 = (Integer) g4Var2.f49980c.f50300o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f20053id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                g4 g4Var3 = this.f49893b;
                Integer num5 = (Integer) g4Var3.f49980c.f50298m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f20053id));
                Integer num6 = (Integer) g4Var3.f49980c.f50298m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f20053id));
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
