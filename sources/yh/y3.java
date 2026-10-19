package yh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class y3 implements Comparator {
    public final int f50607a;
    public final e4 f50608b;

    public y3(e4 e4Var, int i10) {
        this.f50607a = i10;
        this.f50608b = e4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f50607a) {
            case 0:
                e4 e4Var = this.f50608b;
                Integer num = (Integer) e4Var.f50228c.f50509n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) e4Var.f50228c.f50509n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                e4 e4Var2 = this.f50608b;
                Integer num3 = (Integer) e4Var2.f50228c.f50510o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f20279id));
                Integer num4 = (Integer) e4Var2.f50228c.f50510o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f20279id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                e4 e4Var3 = this.f50608b;
                Integer num5 = (Integer) e4Var3.f50228c.f50508m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f20279id));
                Integer num6 = (Integer) e4Var3.f50228c.f50508m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f20279id));
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
