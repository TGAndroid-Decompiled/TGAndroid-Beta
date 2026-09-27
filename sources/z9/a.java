package z9;

import android.util.JsonReader;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import q9.d;
public final class a implements b, d {
    public final int f49054a;

    public a(int i10) {
        this.f49054a = i10;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f49054a) {
            case 2:
                return FirebaseSessionsRegistrar.e(cVar);
            case 3:
                return FirebaseSessionsRegistrar.f(cVar);
            case 4:
                return FirebaseSessionsRegistrar.a(cVar);
            case 5:
                return FirebaseSessionsRegistrar.b(cVar);
            case 6:
                return FirebaseSessionsRegistrar.d(cVar);
            default:
                return FirebaseSessionsRegistrar.c(cVar);
        }
    }

    @Override
    public Object a(JsonReader jsonReader) {
        return c.a(jsonReader);
    }
}
