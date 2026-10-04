package u2;

import android.hardware.fingerprint.FingerprintManager;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.bh1;
import xh.h4;
import yh.u7;
import yh.x3;
public final class l0 implements d9.e, e2.h, q3.g, Continuation, q9.d, a2, GenericProvider, Vector.TLDeserializer, yv0, z9.b {
    public final int f47318a;

    public l0(int i10) {
        this.f47318a = i10;
    }

    public static FingerprintManager b(Object obj) {
        return (FingerprintManager) obj;
    }

    @Override
    public Object E(cf.c cVar) {
        Set v = cVar.v(xa.a.class);
        xa.c cVar2 = xa.c.f49819c;
        if (cVar2 == null) {
            synchronized (xa.c.class) {
                try {
                    cVar2 = xa.c.f49819c;
                    if (cVar2 == null) {
                        cVar2 = new xa.c(0);
                        xa.c.f49819c = cVar2;
                    }
                } finally {
                }
            }
        }
        return new xa.b(v, cVar2);
    }

    @Override
    public Object a(JsonReader jsonReader) {
        char c10;
        char c11;
        String str;
        String str2 = "";
        String str3 = null;
        switch (this.f47318a) {
            case 27:
                jsonReader.beginObject();
                String str4 = null;
                String str5 = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -609862170:
                            if (nextName.equals("libraryName")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3002454:
                            if (nextName.equals("arch")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 230943785:
                            if (nextName.equals("buildId")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            str4 = jsonReader.nextString();
                            if (str4 != null) {
                                break;
                            } else {
                                throw new NullPointerException("Null libraryName");
                            }
                        case 1:
                            str3 = jsonReader.nextString();
                            if (str3 != null) {
                                break;
                            } else {
                                throw new NullPointerException("Null arch");
                            }
                        case 2:
                            str5 = jsonReader.nextString();
                            if (str5 != null) {
                                break;
                            } else {
                                throw new NullPointerException("Null buildId");
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (str3 == null) {
                    str2 = " arch";
                }
                if (str4 == null) {
                    str2 = str2.concat(" libraryName");
                }
                if (str5 == null) {
                    str2 = sa.e.v(str2, " buildId");
                }
                if (str2.isEmpty()) {
                    return new y9.c0(str3, str4, str5);
                }
                throw new IllegalStateException("Missing required properties:".concat(str2));
            case 28:
                jsonReader.beginObject();
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (!nextName2.equals("filename")) {
                        if (!nextName2.equals("contents")) {
                            jsonReader.skipValue();
                        } else {
                            bArr = Base64.decode(jsonReader.nextString(), 2);
                            if (bArr == null) {
                                throw new NullPointerException("Null contents");
                            }
                        }
                    } else {
                        String nextString = jsonReader.nextString();
                        if (nextString != null) {
                            str3 = nextString;
                        } else {
                            throw new NullPointerException("Null filename");
                        }
                    }
                }
                jsonReader.endObject();
                if (str3 == null) {
                    str2 = " filename";
                }
                if (bArr == null) {
                    str2 = str2.concat(" contents");
                }
                if (str2.isEmpty()) {
                    return new y9.f0(str3, bArr);
                }
                throw new IllegalStateException("Missing required properties:".concat(str2));
            default:
                com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(13, false);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.getClass();
                    switch (nextName3.hashCode()) {
                        case -1536268810:
                            if (nextName3.equals("parameterKey")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1027290370:
                            if (nextName3.equals("templateVersion")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1098747284:
                            if (nextName3.equals("rolloutVariant")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1124454216:
                            if (nextName3.equals("parameterValue")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 != null) {
                                sVar.f7922b = nextString2;
                                break;
                            } else {
                                throw new NullPointerException("Null parameterKey");
                            }
                        case 1:
                            sVar.f7924e = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            jsonReader.beginObject();
                            String str6 = null;
                            String str7 = null;
                            while (jsonReader.hasNext()) {
                                String nextName4 = jsonReader.nextName();
                                nextName4.getClass();
                                if (!nextName4.equals("variantId")) {
                                    if (!nextName4.equals("rolloutId")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str6 = jsonReader.nextString();
                                        if (str6 == null) {
                                            throw new NullPointerException("Null rolloutId");
                                        }
                                    }
                                } else {
                                    str7 = jsonReader.nextString();
                                    if (str7 == null) {
                                        throw new NullPointerException("Null variantId");
                                    }
                                }
                            }
                            jsonReader.endObject();
                            if (str6 != null) {
                                str = "";
                            } else {
                                str = " rolloutId";
                            }
                            if (str7 == null) {
                                str = str.concat(" variantId");
                            }
                            if (str.isEmpty()) {
                                sVar.f7923c = new y9.x0(str6, str7);
                                break;
                            } else {
                                throw new IllegalStateException("Missing required properties:".concat(str));
                            }
                        case 3:
                            String nextString3 = jsonReader.nextString();
                            if (nextString3 != null) {
                                sVar.d = nextString3;
                                break;
                            } else {
                                throw new NullPointerException("Null parameterValue");
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return sVar.b();
        }
    }

    @Override
    public void accept(Object obj) {
        switch (this.f47318a) {
            case 1:
                ((z0) obj).f47460b.release();
                return;
            default:
                ((ExecutorService) obj).shutdown();
                return;
        }
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: u2.l0.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        if (i11 != 67 || i12 != 79 || i13 != 77 || (i14 != 77 && i10 != 2)) {
            if (i11 == 77 && i12 == 76 && i13 == 76) {
                if (i14 == 84 || i10 == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f47318a) {
            case 17:
                b2Var.dismiss();
                return;
            case 18:
                b2Var.dismiss();
                return;
            case 22:
                x3.d2(new bh1(6, null));
                return;
            default:
                int i11 = x3.f52211q1;
                return;
        }
    }

    @Override
    public float h(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c1.c(recyclerView);
    }

    @Override
    public RecyclerView i(View view) {
        return ((u7) view).f52108a;
    }

    @Override
    public void n(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c1.b(recyclerView);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = h4.f49981k0;
        return 0;
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        if (task.isSuccessful()) {
            w9.b bVar = (w9.b) task.getResult();
            t9.b bVar2 = t9.b.f46944a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f48930b);
            z10 = true;
            if (bVar.f48931c.delete()) {
                bVar2.b("Deleted report file: " + file.getPath());
            } else {
                bVar2.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public l0(Object obj, int i10) {
        this.f47318a = i10;
    }
}
