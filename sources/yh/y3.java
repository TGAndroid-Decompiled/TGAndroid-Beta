package yh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class y3 implements Comparator {
    public final int f51074a;
    public final e4 f51075b;

    public y3(e4 e4Var, int i10) {
        this.f51074a = i10;
        this.f51075b = e4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f51074a) {
            case 0:
                e4 e4Var = this.f51075b;
                Integer num = (Integer) e4Var.f50680c.f50975n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) e4Var.f50680c.f50975n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                e4 e4Var2 = this.f51075b;
                Integer num3 = (Integer) e4Var2.f50680c.f50976o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f20350id));
                Integer num4 = (Integer) e4Var2.f50680c.f50976o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f20350id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                e4 e4Var3 = this.f51075b;
                Integer num5 = (Integer) e4Var3.f50680c.f50974m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f20350id));
                Integer num6 = (Integer) e4Var3.f50680c.f50974m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f20350id));
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
