package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f42885a;
    public final d f42886b;
    public final int f42887c;

    public a(int i10, d dVar, int i11) {
        this.f42885a = i10;
        this.f42886b = dVar;
        this.f42887c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f42885a);
        this.f42886b.f42895a.performAction(this.f42887c, bundle);
    }
}
