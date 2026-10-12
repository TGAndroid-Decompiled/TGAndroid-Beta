package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f47815a;
    public final d f47816b;
    public final int f47817c;

    public a(int i10, d dVar, int i11) {
        this.f47815a = i10;
        this.f47816b = dVar;
        this.f47817c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47815a);
        this.f47816b.f47826a.performAction(this.f47817c, bundle);
    }
}
