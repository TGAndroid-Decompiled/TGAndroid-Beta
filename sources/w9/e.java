package w9;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;
import u9.g;
public final class e implements u9.e, g {
    public final boolean f49479a = true;
    public final JsonWriter f49480b;
    public final Map f49481c;
    public final Map d;
    public final u9.d f49482e;
    public final boolean f49483f;

    public e(Writer writer, Map map, Map map2, u9.d dVar, boolean z4) {
        this.f49480b = new JsonWriter(writer);
        this.f49481c = map;
        this.d = map2;
        this.f49482e = dVar;
        this.f49483f = z4;
    }

    @Override
    public final u9.e a(u9.c cVar, int i10) {
        String str = cVar.f48458a;
        j();
        JsonWriter jsonWriter = this.f49480b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i10);
        return this;
    }

    @Override
    public final u9.e b(u9.c cVar, long j10) {
        String str = cVar.f48458a;
        j();
        JsonWriter jsonWriter = this.f49480b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j10);
        return this;
    }

    @Override
    public final u9.e c(u9.c cVar, double d) {
        String str = cVar.f48458a;
        j();
        JsonWriter jsonWriter = this.f49480b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    @Override
    public final u9.e d(u9.c cVar, boolean z4) {
        String str = cVar.f48458a;
        j();
        JsonWriter jsonWriter = this.f49480b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z4);
        return this;
    }

    @Override
    public final u9.e e(u9.c cVar, Object obj) {
        i(obj, cVar.f48458a);
        return this;
    }

    @Override
    public final g f(String str) {
        j();
        this.f49480b.value(str);
        return this;
    }

    @Override
    public final g g(boolean z4) {
        j();
        this.f49480b.value(z4);
        return this;
    }

    public final e h(Object obj) {
        JsonWriter jsonWriter = this.f49480b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else {
            int i10 = 0;
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
                    while (i10 < length) {
                        jsonWriter.value(iArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i10 < length2) {
                        long j10 = jArr[i10];
                        j();
                        jsonWriter.value(j10);
                        i10++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i10 < length3) {
                        jsonWriter.value(dArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i10 < length4) {
                        jsonWriter.value(zArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i10 < length5) {
                        h(numberArr[i10]);
                        i10++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i10 < length6) {
                        h(objArr[i10]);
                        i10++;
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
                    } catch (ClassCastException e6) {
                        throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e6);
                    }
                }
                jsonWriter.endObject();
                return this;
            } else {
                u9.d dVar = (u9.d) this.f49481c.get(obj.getClass());
                if (dVar != null) {
                    jsonWriter.beginObject();
                    dVar.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
                u9.f fVar = (u9.f) this.d.get(obj.getClass());
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
                    this.f49482e.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
            }
        }
    }

    public final e i(Object obj, String str) {
        boolean z4 = this.f49483f;
        JsonWriter jsonWriter = this.f49480b;
        if (z4) {
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
        if (this.f49479a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
