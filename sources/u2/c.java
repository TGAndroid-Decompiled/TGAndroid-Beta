package u2;

import android.hardware.fingerprint.FingerprintManager;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import bi.u6;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.List;
import java.util.Set;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.mh1;
import wh.g4;
import xh.x3;
import y9.e2;
public final class c implements d9.e, q3.g, Continuation, c2, GenericProvider, q9.d, Vector.TLDeserializer, z9.b {
    public final int f42281a;

    public c(int i10) {
        this.f42281a = i10;
    }

    public static FingerprintManager c(Object obj) {
        return (FingerprintManager) obj;
    }

    @Override
    public Object P1(u6 u6Var) {
        Set x10 = u6Var.x(xa.a.class);
        xa.c cVar = xa.c.f45075c;
        if (cVar == null) {
            synchronized (xa.c.class) {
                try {
                    cVar = xa.c.f45075c;
                    if (cVar == null) {
                        cVar = new xa.c(0);
                        xa.c.f45075c = cVar;
                    }
                } finally {
                }
            }
        }
        return new xa.b(x10, cVar);
    }

    @Override
    public Object a(JsonReader jsonReader) {
        char c10;
        char c11;
        String str;
        char c12;
        char c13;
        String str2 = " name";
        String str3 = "";
        String str4 = null;
        Long l4 = null;
        String str5 = null;
        String str6 = null;
        switch (this.f42281a) {
            case 25:
                jsonReader.beginObject();
                String str7 = null;
                String str8 = null;
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
                            str7 = jsonReader.nextString();
                            if (str7 != null) {
                                break;
                            } else {
                                throw new NullPointerException("Null libraryName");
                            }
                        case 1:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                str4 = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null arch");
                            }
                        case 2:
                            str8 = jsonReader.nextString();
                            if (str8 != null) {
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
                if (str4 == null) {
                    str3 = " arch";
                }
                if (str7 == null) {
                    str3 = str3.concat(" libraryName");
                }
                if (str8 == null) {
                    str3 = r6.t(str3, " buildId");
                }
                if (str3.isEmpty()) {
                    return new y9.c0(str4, str7, str8);
                }
                throw new IllegalStateException("Missing required properties:".concat(str3));
            case 26:
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
                        String nextString2 = jsonReader.nextString();
                        if (nextString2 != null) {
                            str6 = nextString2;
                        } else {
                            throw new NullPointerException("Null filename");
                        }
                    }
                }
                jsonReader.endObject();
                if (str6 == null) {
                    str3 = " filename";
                }
                if (bArr == null) {
                    str3 = str3.concat(" contents");
                }
                if (str3.isEmpty()) {
                    return new y9.f0(str6, bArr);
                }
                throw new IllegalStateException("Missing required properties:".concat(str3));
            case 27:
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
                            String nextString3 = jsonReader.nextString();
                            if (nextString3 != null) {
                                sVar.f6118b = nextString3;
                                break;
                            } else {
                                throw new NullPointerException("Null parameterKey");
                            }
                        case 1:
                            sVar.e = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            jsonReader.beginObject();
                            String str9 = null;
                            String str10 = null;
                            while (jsonReader.hasNext()) {
                                String nextName4 = jsonReader.nextName();
                                nextName4.getClass();
                                if (!nextName4.equals("variantId")) {
                                    if (!nextName4.equals("rolloutId")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str9 = jsonReader.nextString();
                                        if (str9 == null) {
                                            throw new NullPointerException("Null rolloutId");
                                        }
                                    }
                                } else {
                                    str10 = jsonReader.nextString();
                                    if (str10 == null) {
                                        throw new NullPointerException("Null variantId");
                                    }
                                }
                            }
                            jsonReader.endObject();
                            if (str9 != null) {
                                str = "";
                            } else {
                                str = " rolloutId";
                            }
                            if (str10 == null) {
                                str = str.concat(" variantId");
                            }
                            if (str.isEmpty()) {
                                sVar.f6119c = new y9.x0(str9, str10);
                                break;
                            } else {
                                throw new IllegalStateException("Missing required properties:".concat(str));
                            }
                        case 3:
                            String nextString4 = jsonReader.nextString();
                            if (nextString4 != null) {
                                sVar.d = nextString4;
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
            case 28:
                jsonReader.beginObject();
                Integer num = null;
                List list = null;
                while (jsonReader.hasNext()) {
                    String nextName5 = jsonReader.nextName();
                    nextName5.getClass();
                    switch (nextName5.hashCode()) {
                        case -1266514778:
                            if (nextName5.equals("frames")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 3373707:
                            if (nextName5.equals("name")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 2125650548:
                            if (nextName5.equals("importance")) {
                                c12 = 2;
                                break;
                            }
                            c12 = 65535;
                            break;
                        default:
                            c12 = 65535;
                            break;
                    }
                    switch (c12) {
                        case 0:
                            list = z9.c.d(jsonReader, new z9.a(0));
                            if (list != null) {
                                continue;
                            } else {
                                throw new NullPointerException("Null frames");
                            }
                        case 1:
                            str5 = jsonReader.nextString();
                            if (str5 == null) {
                                throw new NullPointerException("Null name");
                            }
                            break;
                        case 2:
                            num = Integer.valueOf(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (str5 != null) {
                    str2 = "";
                }
                if (num == null) {
                    str2 = str2.concat(" importance");
                }
                if (list == null) {
                    str2 = r6.t(str2, " frames");
                }
                if (str2.isEmpty()) {
                    return new y9.r0(str5, num.intValue(), list);
                }
                throw new IllegalStateException("Missing required properties:".concat(str2));
            default:
                jsonReader.beginObject();
                Long l10 = null;
                String str11 = null;
                String str12 = null;
                while (jsonReader.hasNext()) {
                    String nextName6 = jsonReader.nextName();
                    nextName6.getClass();
                    switch (nextName6.hashCode()) {
                        case 3373707:
                            if (nextName6.equals("name")) {
                                c13 = 0;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 3530753:
                            if (nextName6.equals("size")) {
                                c13 = 1;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 3601339:
                            if (nextName6.equals("uuid")) {
                                c13 = 2;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 1153765347:
                            if (nextName6.equals("baseAddress")) {
                                c13 = 3;
                                break;
                            }
                            c13 = 65535;
                            break;
                        default:
                            c13 = 65535;
                            break;
                    }
                    switch (c13) {
                        case 0:
                            String nextString5 = jsonReader.nextString();
                            if (nextString5 != null) {
                                str11 = nextString5;
                                break;
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        case 1:
                            l10 = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            str12 = new String(Base64.decode(jsonReader.nextString(), 2), e2.f46658a);
                            break;
                        case 3:
                            l4 = Long.valueOf(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (l4 == null) {
                    str3 = " baseAddress";
                }
                if (l10 == null) {
                    str3 = str3.concat(" size");
                }
                if (str11 == null) {
                    str3 = r6.t(str3, " name");
                }
                if (str3.isEmpty()) {
                    return new y9.o0(str11, l4.longValue(), l10.longValue(), str12);
                }
                throw new IllegalStateException("Missing required properties:".concat(str3));
        }
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
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
    public void f(d2 d2Var, int i10) {
        switch (this.f42281a) {
            case 15:
                d2Var.dismiss();
                return;
            case 16:
                d2Var.dismiss();
                return;
            case 21:
                x3.d2(new mh1(6, null));
                return;
            default:
                int i11 = x3.f46266q1;
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = g4.f44101k0;
        return 0;
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        if (task.isSuccessful()) {
            w9.b bVar = (w9.b) task.getResult();
            t9.b bVar2 = t9.b.f42120a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f43871b);
            z10 = true;
            if (bVar.f43872c.delete()) {
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

    public c(Object obj, int i10) {
        this.f42281a = i10;
    }
}
