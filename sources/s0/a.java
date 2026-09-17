package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f42637a;
    public final c f42638b;
    public final int f42639c;

    public a(int i10, c cVar, int i11) {
        this.f42637a = i10;
        this.f42638b = cVar;
        this.f42639c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f42637a);
        this.f42638b.f42646a.performAction(this.f42639c, bundle);
    }
}
