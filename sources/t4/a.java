package t4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m.q;
public final class a implements d {
    public final LinkedHashSet f46871a = new LinkedHashSet();

    public a(q qVar) {
        qVar.f("androidx.savedstate.Restarter", this);
    }

    @Override
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f46871a));
        return bundle;
    }
}
