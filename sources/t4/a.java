package t4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m.r;
public final class a implements d {
    public final LinkedHashSet f45508a = new LinkedHashSet();

    public a(r rVar) {
        rVar.f("androidx.savedstate.Restarter", this);
    }

    @Override
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f45508a));
        return bundle;
    }
}
