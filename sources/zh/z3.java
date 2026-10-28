package zh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class z3 implements Comparator {
    public final int f53427a;
    public final f4 f53428b;

    public z3(f4 f4Var, int i10) {
        this.f53427a = i10;
        this.f53428b = f4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f53427a) {
            case 0:
                f4 f4Var = this.f53428b;
                Integer num = (Integer) f4Var.f53033c.f53333n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) f4Var.f53033c.f53333n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                f4 f4Var2 = this.f53428b;
                Integer num3 = (Integer) f4Var2.f53033c.f53334o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f22034id));
                Integer num4 = (Integer) f4Var2.f53033c.f53334o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f22034id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                f4 f4Var3 = this.f53428b;
                Integer num5 = (Integer) f4Var3.f53033c.f53332m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f22034id));
                Integer num6 = (Integer) f4Var3.f53033c.f53332m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f22034id));
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
