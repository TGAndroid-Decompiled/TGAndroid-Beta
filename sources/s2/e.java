package s2;

import androidx.biometric.f0;
import j7.l5;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class e extends com.googlecode.mp4parser.c {
    public static final f0 f46857f;
    public List f46858e;

    static {
        de.a aVar = new de.a(e.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f46857f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = l5.a(r2.b.i(byteBuffer));
        this.f46858e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.f46858e.add(new d(l5.a(r2.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f46858e.size());
        for (d dVar : this.f46858e) {
            byteBuffer.putInt(dVar.f46855a);
            byteBuffer.putInt(dVar.f46856b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f46858e.size() * 8) + 8;
    }
}
