package t4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m.p;
public final class a implements d {
    public final LinkedHashSet f48541a = new LinkedHashSet();

    public a(p pVar) {
        pVar.f("androidx.savedstate.Restarter", this);
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f48541a));
        return bundle;
    }
}
