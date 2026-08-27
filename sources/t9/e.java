package t9;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import r9.g;

public final class e implements r9.e, g {

    public final boolean f48146a = true;

    public final JsonWriter f48147b;

    public final Map f48148c;
    public final Map d;

    public final r9.d f48149e;

    public final boolean f48150f;

    public e(Writer writer, Map map, Map map2, r9.d dVar, boolean z10) {
        this.f48147b = new JsonWriter(writer);
        this.f48148c = map;
        this.d = map2;
        this.f48149e = dVar;
        this.f48150f = z10;
    }

    @Override
    public final r9.e a(r9.c cVar, Object obj) throws IOException {
        i(obj, cVar.f46877a);
        return this;
    }

    @Override
    public final g b(String str) throws IOException {
        j();
        this.f48147b.value(str);
        return this;
    }

    @Override
    public final r9.e c(r9.c cVar, long j10) throws IOException {
        String str = cVar.f46877a;
        j();
        JsonWriter jsonWriter = this.f48147b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j10);
        return this;
    }

    @Override
    public final r9.e d(r9.c cVar, int i10) throws IOException {
        String str = cVar.f46877a;
        j();
        JsonWriter jsonWriter = this.f48147b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i10);
        return this;
    }

    @Override
    public final r9.e e(r9.c cVar, double d) throws IOException {
        String str = cVar.f46877a;
        j();
        JsonWriter jsonWriter = this.f48147b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    @Override
    public final g f(boolean z10) throws IOException {
        j();
        this.f48147b.value(z10);
        return this;
    }

    @Override
    public final r9.e g(r9.c cVar, boolean z10) throws IOException {
        String str = cVar.f46877a;
        j();
        JsonWriter jsonWriter = this.f48147b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z10);
        return this;
    }

    public final e h(Object obj) {
        JsonWriter jsonWriter = this.f48147b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e9) {
                        throw new r9.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e9);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            r9.d dVar = (r9.d) this.f48148c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            r9.f fVar = (r9.f) this.d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f48149e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof f) {
                int iA = ((f) obj).a();
                j();
                jsonWriter.value(iA);
                return this;
            }
            String strName = ((Enum) obj).name();
            j();
            jsonWriter.value(strName);
            return this;
        }
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
    }

    public final e i(Object obj, String str) throws IOException {
        boolean z10 = this.f48150f;
        JsonWriter jsonWriter = this.f48147b;
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
        if (!this.f48146a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
