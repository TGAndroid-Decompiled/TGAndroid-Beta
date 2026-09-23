package za;

import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
public final class o implements q9.d, i5.e {
    @Override
    public Object G(cf.c cVar) {
        return FirebaseSessionsRegistrar.c(cVar);
    }

    @Override
    public Object apply(Object obj) {
        wa.e eVar = (wa.e) obj;
        eVar.getClass();
        aa.a aVar = com.google.firebase.messaging.r.f7330a;
        aVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            aVar.j(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
