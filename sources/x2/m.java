package x2;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;
public final class m {
    public final long f46693a;

    public m(long j10) {
        this.f46693a = j10;
    }

    public static m a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return new m(Long.parseLong(jsonReader.nextString()));
                    }
                    return new m(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof m) && this.f46693a == ((m) obj).f46693a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46693a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return android.support.v4.media.a.q(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f46693a, "}");
    }
}
