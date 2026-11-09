package zh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class i2 implements Comparator {
    public final int f60399a;
    public final m3 f60400b;

    public i2(m3 m3Var, int i7) {
        this.f60399a = i7;
        this.f60400b = m3Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f60399a) {
            case 0:
                c3 c3Var = this.f60400b.d;
                Integer num = (Integer) c3Var.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26962id));
                Integer num2 = (Integer) c3Var.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26962id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                c3 c3Var2 = this.f60400b.d;
                Integer num3 = (Integer) c3Var2.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) c3Var2.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                c3 c3Var3 = this.f60400b.d;
                Integer num5 = (Integer) c3Var3.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26962id));
                Integer num6 = (Integer) c3Var3.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26962id));
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
