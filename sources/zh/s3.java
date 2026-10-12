package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h11;
public final class s3 {
    public final float f51155a;
    public final h11 f51156b;
    public final h11 f51157c;

    public s3(float f7, String str, CharSequence charSequence) {
        this.f51156b = new h11(str, 12.0f, null);
        this.f51157c = new h11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f51155a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f51156b.j(), this.f51157c.j());
    }
}
