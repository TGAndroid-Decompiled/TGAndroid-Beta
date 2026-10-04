package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f46460a;
    public final d f46461b;
    public final int f46462c;

    public a(int i10, d dVar, int i11) {
        this.f46460a = i10;
        this.f46461b = dVar;
        this.f46462c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f46460a);
        this.f46461b.f46471a.performAction(this.f46462c, bundle);
    }
}
