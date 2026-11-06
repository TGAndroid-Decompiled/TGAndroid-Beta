package pa;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;
import na.g;
public final class e implements na.e, g {
    public final boolean f53398a = true;
    public final JsonWriter f53399b;
    public final Map f53400c;
    public final Map d;
    public final na.d f53401e;
    public final boolean f53402f;

    public e(Writer writer, Map map, Map map2, na.d dVar, boolean z9) {
        this.f53399b = new JsonWriter(writer);
        this.f53400c = map;
        this.d = map2;
        this.f53401e = dVar;
        this.f53402f = z9;
    }

    @Override
    public final na.e a(na.c cVar, Object obj) {
        i(obj, cVar.f20529a);
        return this;
    }

    @Override
    public final na.e b(na.c cVar, double d) {
        String str = cVar.f20529a;
        j();
        JsonWriter jsonWriter = this.f53399b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    @Override
    public final na.e c(na.c cVar, boolean z9) {
        String str = cVar.f20529a;
        j();
        JsonWriter jsonWriter = this.f53399b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z9);
        return this;
    }

    @Override
    public final na.e d(na.c cVar, int i7) {
        String str = cVar.f20529a;
        j();
        JsonWriter jsonWriter = this.f53399b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i7);
        return this;
    }

    @Override
    public final na.e e(na.c cVar, long j3) {
        String str = cVar.f20529a;
        j();
        JsonWriter jsonWriter = this.f53399b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j3);
        return this;
    }

    @Override
    public final g f(String str) {
        j();
        this.f53399b.value(str);
        return this;
    }

    @Override
    public final g g(boolean z9) {
        j();
        this.f53399b.value(z9);
        return this;
    }

    public final e h(Object obj) {
        JsonWriter jsonWriter = this.f53399b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else {
            int i7 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    j();
                    jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                    return this;
                }
                jsonWriter.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i7 < length) {
                        jsonWriter.value(iArr[i7]);
                        i7++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i7 < length2) {
                        long j3 = jArr[i7];
                        j();
                        jsonWriter.value(j3);
                        i7++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i7 < length3) {
                        jsonWriter.value(dArr[i7]);
                        i7++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i7 < length4) {
                        jsonWriter.value(zArr[i7]);
                        i7++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i7 < length5) {
                        h(numberArr[i7]);
                        i7++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i7 < length6) {
                        h(objArr[i7]);
                        i7++;
                    }
                }
                jsonWriter.endArray();
                return this;
            } else if (obj instanceof Collection) {
                jsonWriter.beginArray();
                for (Object obj2 : (Collection) obj) {
                    h(obj2);
                }
                jsonWriter.endArray();
                return this;
            } else if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                jsonWriter.endObject();
                return this;
            } else {
                na.d dVar = (na.d) this.f53400c.get(obj.getClass());
                if (dVar != null) {
                    jsonWriter.beginObject();
                    dVar.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
                na.f fVar = (na.f) this.d.get(obj.getClass());
                if (fVar != null) {
                    fVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    if (obj instanceof f) {
                        int a10 = ((f) obj).a();
                        j();
                        jsonWriter.value(a10);
                        return this;
                    }
                    String name = ((Enum) obj).name();
                    j();
                    jsonWriter.value(name);
                    return this;
                } else {
                    jsonWriter.beginObject();
                    this.f53401e.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
            }
        }
    }

    public final e i(Object obj, String str) {
        boolean z9 = this.f53402f;
        JsonWriter jsonWriter = this.f53399b;
        if (z9) {
            if (obj == null) {
                return this;
            }
            j();
            jsonWriter.name(str);
            h(obj);
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        h(obj);
        return this;
    }

    public final void j() {
        if (this.f53398a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
