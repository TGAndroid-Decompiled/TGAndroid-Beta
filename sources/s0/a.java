package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f46459a;
    public final d f46460b;
    public final int f46461c;

    public a(int i10, d dVar, int i11) {
        this.f46459a = i10;
        this.f46460b = dVar;
        this.f46461c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f46459a);
        this.f46460b.f46470a.performAction(this.f46461c, bundle);
    }
}
