package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f43893a;
    public final e f43894b;
    public final int f43895c;

    public a(int i10, e eVar, int i11) {
        this.f43893a = i10;
        this.f43894b = eVar;
        this.f43895c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f43893a);
        this.f43894b.f43904a.performAction(this.f43895c, bundle);
    }
}
