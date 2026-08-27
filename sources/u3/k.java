package u3;

import android.graphics.Typeface;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import yf.g0;
import zf.n2;

public final class k implements o8.e, t2.g, com.google.android.exoplayer2.upstream.l, g0, z8.e, y9.a, z8.d, OnFailureListener {

    public final int f48322a;

    public k(int i10) {
        this.f48322a = i10;
    }

    @Override
    public Typeface a() {
        switch (this.f48322a) {
            case 9:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 10:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 11:
                return Typeface.create("serif", 1);
            case 12:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 13:
                return AndroidUtilities.getTypeface("fonts/rmono.ttf");
            default:
                return AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
        }
    }

    @Override
    public Object apply(Object obj) {
        return (p) obj;
    }

    @Override
    public List c(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public com.google.android.exoplayer2.upstream.m createDataSource() {
        return new com.google.android.exoplayer2.upstream.c(ApplicationLoader.applicationContext);
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = n2.f50607n0;
    }

    @Override
    public Object u0(af.h hVar) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(hVar);
    }

    @Override
    public void b(y9.b bVar) {
    }

    @Override
    public void d(Exception exc) {
    }
}
