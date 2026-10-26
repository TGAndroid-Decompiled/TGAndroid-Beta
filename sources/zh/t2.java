package zh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class t2 implements Comparator {
    public final int f53252a;
    public final h4 f53253b;

    public t2(h4 h4Var, int i10) {
        this.f53252a = i10;
        this.f53253b = h4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f53252a) {
            case 0:
                u3 u3Var = this.f53253b.d;
                Integer num = (Integer) u3Var.f53276o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f22033id));
                Integer num2 = (Integer) u3Var.f53276o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f22033id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                u3 u3Var2 = this.f53253b.d;
                Integer num3 = (Integer) u3Var2.f53275n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) u3Var2.f53275n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                u3 u3Var3 = this.f53253b.d;
                Integer num5 = (Integer) u3Var3.f53274m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f22033id));
                Integer num6 = (Integer) u3Var3.f53274m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f22033id));
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
