package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f45860a;
    public final c f45861b;
    public final int f45862c;

    public a(int i10, c cVar, int i11) {
        this.f45860a = i10;
        this.f45861b = cVar;
        this.f45862c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f45860a);
        this.f45861b.f45869a.performAction(this.f45862c, bundle);
    }
}
