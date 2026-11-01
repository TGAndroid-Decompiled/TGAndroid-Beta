package yh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class t implements TextWatcher {
    public final int f54532a;
    public final z f54533b;

    public t(z zVar, int i10) {
        this.f54532a = i10;
        this.f54533b = zVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f54532a) {
            case 0:
                String obj = editable.toString();
                z zVar = this.f54533b;
                boolean isEmpty = TextUtils.isEmpty(zVar.I1);
                zVar.I1 = obj;
                zVar.f54556w1.h(0L, zVar.l1, 0L, 0L, null, false, obj, isEmpty);
                return;
            default:
                String obj2 = editable.toString();
                z zVar2 = this.f54533b;
                zVar2.J1 = obj2;
                zVar2.f54557x1.f31183f3.O(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f54532a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f54532a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
