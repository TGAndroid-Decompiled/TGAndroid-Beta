package xh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class a4 implements Comparator {
    public final int f46074a;
    public final g4 f46075b;

    public a4(g4 g4Var, int i10) {
        this.f46074a = i10;
        this.f46075b = g4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f46074a) {
            case 0:
                g4 g4Var = this.f46075b;
                Integer num = (Integer) g4Var.f46159c.f46460n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) g4Var.f46159c.f46460n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                g4 g4Var2 = this.f46075b;
                Integer num3 = (Integer) g4Var2.f46159c.f46461o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f18341id));
                Integer num4 = (Integer) g4Var2.f46159c.f46461o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f18341id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                g4 g4Var3 = this.f46075b;
                Integer num5 = (Integer) g4Var3.f46159c.f46459m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f18341id));
                Integer num6 = (Integer) g4Var3.f46159c.f46459m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f18341id));
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
