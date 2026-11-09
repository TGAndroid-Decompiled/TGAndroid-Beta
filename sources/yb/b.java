package yb;

import a8.v1;
import a8.w2;
import a8.x3;
import a8.y4;
import a8.y6;
import a8.z0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import c8.xb;
import fh.g;
import java.util.ArrayList;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.r0;
import org.telegram.ui.ActionBar.s4;
import pb.j;
import q6.m;
import zh.m3;
import zh.u2;
public final class b implements a, s4 {
    public boolean f59347a;
    public Object f59348b;
    public Object f59349c;
    public Object d;
    public Object f59350e;

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public boolean b(r0 r0Var, RectF rectF) {
        int L;
        float L2 = g0.L(6.0f);
        rectF.set(L2, L2, ((FrameLayout) this.f59348b).getWidth() - L, ((FrameLayout) this.f59348b).getHeight() - L);
        return true;
    }

    @Override
    public ArrayList c(ub.a aVar) {
        Bitmap createBitmap;
        if (((z0) this.f59350e) == null) {
            zzb();
        }
        if (((z0) this.f59350e) != null) {
            int i7 = aVar.f56505e;
            if (i7 != -1) {
                if (i7 != 17) {
                    if (i7 != 35) {
                        if (i7 != 842094169) {
                            throw new lb.a("Unsupported image format", 13);
                        }
                        m.g(null);
                        throw null;
                    }
                    m.g(null);
                    throw null;
                }
                m.g(null);
                throw null;
            }
            Bitmap bitmap = aVar.f56502a;
            m.g(bitmap);
            int i10 = aVar.d;
            int i11 = aVar.f56503b;
            int i12 = aVar.f56504c;
            if (i10 == 0) {
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate(i10);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
            }
            try {
                z0 z0Var = (z0) this.f59350e;
                m.g(z0Var);
                a7.b bVar = new a7.b(createBitmap);
                Parcel p12 = z0Var.p1();
                int i13 = a8.g0.f404a;
                p12.writeStrongBinder(bVar);
                p12.writeInt(1);
                int r10 = xb.r(p12, 20293);
                xb.q(p12, 2, 4);
                p12.writeInt(-1);
                xb.s(p12, r10);
                Parcel r12 = z0Var.r1(p12, 1);
                y4[] y4VarArr = (y4[]) r12.createTypedArray(y4.CREATOR);
                r12.recycle();
                ArrayList arrayList = new ArrayList();
                for (y4 y4Var : y4VarArr) {
                    arrayList.add(new wb.a(y4Var.f715c, y4Var.d, y4Var.f714b, y4Var.f713a));
                }
                return arrayList;
            } catch (RemoteException e10) {
                throw new lb.a("Failed to run legacy image labeler.", e10);
            }
        }
        throw new lb.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public g e(j5 j5Var) {
        m3 m3Var = (m3) this.f59350e;
        g c10 = m3Var.getBaseSimpleGlass().d.c(j5Var, null, false);
        c10.p(m3Var.M);
        q.p(c10, g0.L(23.0f), 6.0f);
        return c10;
    }

    @Override
    public void f(j5 j5Var, r0 r0Var) {
        boolean z9;
        int i7 = 0;
        if (j5Var != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f59347a = z9;
        FrameLayout frameLayout = (FrameLayout) this.f59348b;
        if (z9) {
            i7 = 4;
        }
        frameLayout.setVisibility(i7);
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = ((m3) this.f59350e).M;
        return eVar.a(eVar.f13971e);
    }

    @Override
    public gh.a getButtonsGlassColorProvider() {
        return ((m3) this.f59350e).M;
    }

    @Override
    public gh.a getMenuGlassColorProvider() {
        return ((m3) this.f59350e).M;
    }

    @Override
    public View getMenuHostView() {
        return (FrameLayout) this.f59348b;
    }

    @Override
    public g6 getMenuResourcesProvider() {
        g6 g6Var;
        g6Var = ((f2) ((m3) this.f59350e)).resourceProvider;
        return g6Var;
    }

    @Override
    public int getMenuRise() {
        return g0.L(8.0f);
    }

    @Override
    public View getMenuView() {
        return (u2) this.f59349c;
    }

    @Override
    public j5 getOpenMenuOverlay() {
        if (this.f59347a) {
            return (j5) this.d;
        }
        return null;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f10) {
        ri.d dVar = ((m3) this.f59350e).getBaseSimpleGlass().f21022e;
        if (dVar != null) {
            dVar.k(f10);
        }
    }

    @Override
    public void zzb() {
        IInterface aVar;
        String str = (String) this.d;
        Context context = (Context) this.f59348b;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (((z0) this.f59350e) == null) {
            try {
                IBinder b10 = b7.f.c(context, b7.f.f2994b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
                int i7 = w2.f692b;
                if (b10 == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                    if (queryLocalInterface instanceof x3) {
                        aVar = (x3) queryLocalInterface;
                    } else {
                        aVar = new a8.a(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 0);
                    }
                }
                z0 x12 = ((v1) aVar).x1(new a7.b(context), (y6) this.f59349c);
                this.f59350e = x12;
                if (x12 == null && !this.f59347a) {
                    Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                    j.b(context);
                    this.f59347a = true;
                }
            } catch (RemoteException e10) {
                throw new lb.a("Failed to create legacy image labeler.", e10);
            } catch (b7.b e11) {
                if (!str.equals("com.google.android.gms.vision.dynamite")) {
                    if (!this.f59347a) {
                        Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                        j.b(context);
                        this.f59347a = true;
                        return;
                    }
                    return;
                }
                throw new lb.a("Failed to load deprecated vision dynamite module.", e11);
            }
        }
    }

    @Override
    public void zzc() {
        z0 z0Var = (z0) this.f59350e;
        if (z0Var != null) {
            try {
                z0Var.t1(z0Var.p1(), 2);
            } catch (RemoteException e10) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e10);
            }
            this.f59350e = null;
        }
    }
}
