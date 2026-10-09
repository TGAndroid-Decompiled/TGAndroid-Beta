package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f47574a;
    public final d f47575b;
    public final int f47576c;

    public a(int i10, d dVar, int i11) {
        this.f47574a = i10;
        this.f47575b = dVar;
        this.f47576c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47574a);
        this.f47575b.f47585a.performAction(this.f47576c, bundle);
    }
}
