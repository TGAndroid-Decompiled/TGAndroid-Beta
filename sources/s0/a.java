package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f56156a;
    public final c f56157b;
    public final int f56158c;

    public a(int i7, c cVar, int i10) {
        this.f56156a = i7;
        this.f56157b = cVar;
        this.f56158c = i10;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f56156a);
        this.f56157b.f56166a.performAction(this.f56158c, bundle);
    }
}
