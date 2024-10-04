import type { ViewConfig } from '@vaadin/hilla-file-router/types.js';

export const config: ViewConfig = {
  title: 'HillaRouteTest',
};

export default function HillaRouteTest() {
    return (
        <div className="flex flex-col">
            <h1>HillaRouteTest In React</h1>
        </div>
    );
}
