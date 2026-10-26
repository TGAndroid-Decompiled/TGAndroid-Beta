package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f47641a;
    public final d f47642b;
    public final int f47643c;

    public a(int i10, d dVar, int i11) {
        this.f47641a = i10;
        this.f47642b = dVar;
        this.f47643c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47641a);
        this.f47642b.f47653a.performAction(this.f47643c, bundle);
    }
}
