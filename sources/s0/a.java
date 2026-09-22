package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f42611a;
    public final c f42612b;
    public final int f42613c;

    public a(int i10, c cVar, int i11) {
        this.f42611a = i10;
        this.f42612b = cVar;
        this.f42613c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f42611a);
        this.f42612b.f42620a.performAction(this.f42613c, bundle);
    }
}
