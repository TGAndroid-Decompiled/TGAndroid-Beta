package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f54559a;
    public final d f54560b;
    public final int f54561c;

    public a(int i3, d dVar, int i10) {
        this.f54559a = i3;
        this.f54560b = dVar;
        this.f54561c = i10;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f54559a);
        this.f54560b.f54570a.performAction(this.f54561c, bundle);
    }
}
