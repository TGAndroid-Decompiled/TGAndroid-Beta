package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f45906a;
    public final c f45907b;
    public final int f45908c;

    public a(int i10, c cVar, int i11) {
        this.f45906a = i10;
        this.f45907b = cVar;
        this.f45908c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f45906a);
        this.f45907b.f45915a.performAction(this.f45908c, bundle);
    }
}
