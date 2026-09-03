package pa;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
public abstract class u {
    public final Object fromJson(Reader reader) {
        return read(new xa.a(reader));
    }

    public final Object fromJsonTree(i iVar) {
        try {
            ?? aVar = new xa.a(sa.l.F);
            aVar.B = new Object[32];
            aVar.C = 0;
            aVar.D = new String[32];
            aVar.E = new int[32];
            aVar.L(iVar);
            return read(aVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final u nullSafe() {
        return new e(this, 2);
    }

    public abstract Object read(xa.a aVar);

    public final void toJson(Writer writer, Object obj) {
        write(new xa.b(writer), obj);
    }

    public final i toJsonTree(Object obj) {
        try {
            sa.n nVar = new sa.n();
            write(nVar, obj);
            return nVar.u();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract void write(xa.b bVar, Object obj);

    public final Object fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
