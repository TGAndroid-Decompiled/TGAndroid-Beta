package s9;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;
import q9.g;
public final class e implements q9.e, g {
    public final boolean f47497a = true;
    public final JsonWriter f47498b;
    public final Map f47499c;
    public final Map d;
    public final q9.d f47500e;
    public final boolean f47501f;

    public e(Writer writer, Map map, Map map2, q9.d dVar, boolean z10) {
        this.f47498b = new JsonWriter(writer);
        this.f47499c = map;
        this.d = map2;
        this.f47500e = dVar;
        this.f47501f = z10;
    }

    @Override
    public final q9.e a(q9.c cVar, boolean z10) {
        String str = cVar.f46118a;
        j();
        JsonWriter jsonWriter = this.f47498b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z10);
        return this;
    }

    @Override
    public final q9.e b(q9.c cVar, double d) {
        String str = cVar.f46118a;
        j();
        JsonWriter jsonWriter = this.f47498b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    @Override
    public final q9.e c(q9.c cVar, int i9) {
        String str = cVar.f46118a;
        j();
        JsonWriter jsonWriter = this.f47498b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i9);
        return this;
    }

    @Override
    public final q9.e d(q9.c cVar, long j10) {
        String str = cVar.f46118a;
        j();
        JsonWriter jsonWriter = this.f47498b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j10);
        return this;
    }

    @Override
    public final g e(String str) {
        j();
        this.f47498b.value(str);
        return this;
    }

    @Override
    public final g f(boolean z10) {
        j();
        this.f47498b.value(z10);
        return this;
    }

    @Override
    public final q9.e g(q9.c cVar, Object obj) {
        i(obj, cVar.f46118a);
        return this;
    }

    public final e h(Object obj) {
        JsonWriter jsonWriter = this.f47498b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else {
            int i9 = 0;
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
                    while (i9 < length) {
                        jsonWriter.value(iArr[i9]);
                        i9++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i9 < length2) {
                        long j10 = jArr[i9];
                        j();
                        jsonWriter.value(j10);
                        i9++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i9 < length3) {
                        jsonWriter.value(dArr[i9]);
                        i9++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i9 < length4) {
                        jsonWriter.value(zArr[i9]);
                        i9++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i9 < length5) {
                        h(numberArr[i9]);
                        i9++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i9 < length6) {
                        h(objArr[i9]);
                        i9++;
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
                q9.d dVar = (q9.d) this.f47499c.get(obj.getClass());
                if (dVar != null) {
                    jsonWriter.beginObject();
                    dVar.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
                q9.f fVar = (q9.f) this.d.get(obj.getClass());
                if (fVar != null) {
                    fVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    if (obj instanceof f) {
                        int a2 = ((f) obj).a();
                        j();
                        jsonWriter.value(a2);
                        return this;
                    }
                    String name = ((Enum) obj).name();
                    j();
                    jsonWriter.value(name);
                    return this;
                } else {
                    jsonWriter.beginObject();
                    this.f47500e.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
            }
        }
    }

    public final e i(Object obj, String str) {
        boolean z10 = this.f47501f;
        JsonWriter jsonWriter = this.f47498b;
        if (z10) {
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
        if (this.f47497a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
