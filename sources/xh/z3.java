package xh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class z3 implements Comparator {
    public final int f46264a;
    public final f4 f46265b;

    public z3(f4 f4Var, int i10) {
        this.f46264a = i10;
        this.f46265b = f4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f46264a) {
            case 0:
                f4 f4Var = this.f46265b;
                Integer num = (Integer) f4Var.f45892c.f46176n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) f4Var.f45892c.f46176n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                f4 f4Var2 = this.f46265b;
                Integer num3 = (Integer) f4Var2.f45892c.f46177o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f18127id));
                Integer num4 = (Integer) f4Var2.f45892c.f46177o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f18127id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                f4 f4Var3 = this.f46265b;
                Integer num5 = (Integer) f4Var3.f45892c.f46175m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f18127id));
                Integer num6 = (Integer) f4Var3.f45892c.f46175m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f18127id));
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
