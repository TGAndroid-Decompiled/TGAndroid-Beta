package ph;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class l2 implements Comparator {
    public final int f45220a;
    public final r3 f45221b;

    public l2(r3 r3Var, int i10) {
        this.f45220a = i10;
        this.f45221b = r3Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f45220a) {
            case 0:
                h3 h3Var = this.f45221b.d;
                Integer num = (Integer) h3Var.f45111o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f19800id));
                Integer num2 = (Integer) h3Var.f45111o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f19800id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                h3 h3Var2 = this.f45221b.d;
                Integer num3 = (Integer) h3Var2.f45110n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) h3Var2.f45110n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                h3 h3Var3 = this.f45221b.d;
                Integer num5 = (Integer) h3Var3.f45109m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f19800id));
                Integer num6 = (Integer) h3Var3.f45109m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f19800id));
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
