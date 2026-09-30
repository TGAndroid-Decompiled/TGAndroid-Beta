package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f43007a;
    public final d f43008b;
    public final int f43009c;

    public a(int i10, d dVar, int i11) {
        this.f43007a = i10;
        this.f43008b = dVar;
        this.f43009c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f43007a);
        this.f43008b.f43017a.performAction(this.f43009c, bundle);
    }
}
