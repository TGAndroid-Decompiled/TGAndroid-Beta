package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f41549a;
    public final d f41550b;
    public final int f41551c;

    public a(int i10, d dVar, int i11) {
        this.f41549a = i10;
        this.f41550b = dVar;
        this.f41551c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f41549a);
        this.f41550b.f41559a.performAction(this.f41551c, bundle);
    }
}
