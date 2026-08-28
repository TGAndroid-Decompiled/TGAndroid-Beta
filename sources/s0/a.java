package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f47281a;
    public final d f47282b;
    public final int f47283c;

    public a(int i9, d dVar, int i10) {
        this.f47281a = i9;
        this.f47282b = dVar;
        this.f47283c = i10;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47281a);
        this.f47282b.f47292a.performAction(this.f47283c, bundle);
    }
}
