package zh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class t2 implements Comparator {
    public final int f53310a;
    public final h4 f53311b;

    public t2(h4 h4Var, int i10) {
        this.f53310a = i10;
        this.f53311b = h4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f53310a) {
            case 0:
                u3 u3Var = this.f53311b.d;
                Integer num = (Integer) u3Var.f53334o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f22034id));
                Integer num2 = (Integer) u3Var.f53334o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f22034id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                u3 u3Var2 = this.f53311b.d;
                Integer num3 = (Integer) u3Var2.f53333n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) u3Var2.f53333n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                u3 u3Var3 = this.f53311b.d;
                Integer num5 = (Integer) u3Var3.f53332m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f22034id));
                Integer num6 = (Integer) u3Var3.f53332m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f22034id));
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
