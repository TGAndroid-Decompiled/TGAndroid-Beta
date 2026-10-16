package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i11;
public final class s3 {
    public final float f51156a;
    public final i11 f51157b;
    public final i11 f51158c;

    public s3(float f7, String str, CharSequence charSequence) {
        this.f51157b = new i11(str, 12.0f, null);
        this.f51158c = new i11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f51156a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f51157b.j(), this.f51158c.j());
    }
}
