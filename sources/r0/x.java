package r0;

import android.text.TextUtils;
import android.view.View;

public final class x extends p1.c {

    public final int f46647e;

    public x(int i10, Class cls, int i11, int i12, int i13) {
        this.f46647e = i13;
        this.f45341a = i10;
        this.d = cls;
        this.f45343c = i11;
        this.f45342b = i12;
    }

    @Override
    public final Object b(View view) {
        switch (this.f46647e) {
            case 0:
                return Boolean.valueOf(e0.c(view));
            case 1:
                return e0.a(view);
            default:
                return Boolean.valueOf(e0.b(view));
        }
    }

    @Override
    public final void c(View view, Object obj) {
        switch (this.f46647e) {
            case 0:
                e0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                e0.e(view, (CharSequence) obj);
                break;
            default:
                e0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override
    public final boolean e(Object obj, Object obj2) {
        switch (this.f46647e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
