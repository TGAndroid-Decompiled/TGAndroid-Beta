package z9;

import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.List;
import q9.d;
import y9.e2;
import y9.o0;
import y9.r0;
public final class a implements b, d {
    public final int f53048a;

    public a(int i10) {
        this.f53048a = i10;
    }

    @Override
    public Object E(cf.c cVar) {
        switch (this.f53048a) {
            case 4:
                return FirebaseSessionsRegistrar.e(cVar);
            case 5:
                return FirebaseSessionsRegistrar.f(cVar);
            case 6:
                return FirebaseSessionsRegistrar.a(cVar);
            case 7:
                return FirebaseSessionsRegistrar.b(cVar);
            case 8:
                return FirebaseSessionsRegistrar.d(cVar);
            default:
                return FirebaseSessionsRegistrar.c(cVar);
        }
    }

    @Override
    public Object a(JsonReader jsonReader) {
        char c10;
        char c11;
        String str = " name";
        String str2 = "";
        String str3 = null;
        Long l4 = null;
        switch (this.f53048a) {
            case 0:
                jsonReader.beginObject();
                Integer num = null;
                List list = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -1266514778:
                            if (nextName.equals("frames")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3373707:
                            if (nextName.equals("name")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2125650548:
                            if (nextName.equals("importance")) {
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
                            list = c.d(jsonReader, new a(2));
                            if (list != null) {
                                continue;
                            } else {
                                throw new NullPointerException("Null frames");
                            }
                        case 1:
                            str3 = jsonReader.nextString();
                            if (str3 == null) {
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
                if (str3 != null) {
                    str = "";
                }
                if (num == null) {
                    str = str.concat(" importance");
                }
                if (list == null) {
                    str = t8.b.v(str, " frames");
                }
                if (str.isEmpty()) {
                    return new r0(str3, num.intValue(), list);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
            case 1:
                jsonReader.beginObject();
                Long l10 = null;
                String str4 = null;
                String str5 = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    switch (nextName2.hashCode()) {
                        case 3373707:
                            if (nextName2.equals("name")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3530753:
                            if (nextName2.equals("size")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3601339:
                            if (nextName2.equals("uuid")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1153765347:
                            if (nextName2.equals("baseAddress")) {
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
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                str4 = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        case 1:
                            l10 = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            str5 = new String(Base64.decode(jsonReader.nextString(), 2), e2.f50626a);
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
                    str2 = " baseAddress";
                }
                if (l10 == null) {
                    str2 = str2.concat(" size");
                }
                if (str4 == null) {
                    str2 = t8.b.v(str2, " name");
                }
                if (str2.isEmpty()) {
                    return new o0(str4, l4.longValue(), l10.longValue(), str5);
                }
                throw new IllegalStateException("Missing required properties:".concat(str2));
            default:
                return c.a(jsonReader);
        }
    }
}
